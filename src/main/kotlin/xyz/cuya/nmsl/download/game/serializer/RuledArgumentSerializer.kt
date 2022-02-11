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
import kotlinx.serialization.json.JsonDecoder
import xyz.cuya.nmsl.download.game.RuledArgument

object RuledArgumentSerializer: KSerializer<RuledArgument> {
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("RuledArgumentSerializer", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): RuledArgument {
        if ((decoder as JsonDecoder).decodeJsonElement().toString().contains("features", ignoreCase = true)) {
            return RuledArgument("")
        } else {
            println(decoder.decodeJsonElement().toString())
            TODO("Not yet implemented")
        }
    }

    override fun serialize(encoder: Encoder, value: RuledArgument) {
        TODO("Not yet implemented")
    }
}