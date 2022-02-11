/*
 * Copyright 2022-2022 purofle <purofle@qq.com> and contributors.
 *
 *   Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 *   https://github.com/purofle/NMSLCore/blob/main/LICENSE
 */

package xyz.cuya.nmsl.download.game.serializer

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.*
import xyz.cuya.nmsl.download.game.Argument
import xyz.cuya.nmsl.download.game.RuledArgument

object ArgumentsSerializer: KSerializer<Argument> {
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("Argument", PrimitiveKind.STRING)
    override fun deserialize(decoder: Decoder): Argument {
        // get JsonElement
        return when(val jsonElement = (decoder as JsonDecoder).decodeJsonElement()) {
            is JsonPrimitive -> {
                // 普通参数
                Argument(jsonElement.toString())
            }
            is JsonObject -> {
                // 需要rules过滤的参数
                val ruledArgument: RuledArgument = Json.decodeFromJsonElement(jsonElement)
                Argument(jsonElement.toString())
            }
            else -> {
                Argument("")
            }
        }

    }

    override fun serialize(encoder: Encoder, value: Argument) {
        TODO("Not yet implemented")
    }
}