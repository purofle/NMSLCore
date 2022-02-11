/*
 * Copyright 2022-2022 purofle <purofle@qq.com> and contributors.
 *
 *   Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 *   https://github.com/purofle/NMSLCore/blob/master/LICENSE
 */

package xyz.cuya.nmsl.download.game.serializer

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object DateSerializer: KSerializer<LocalDateTime> {
    val dateTimeFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX")
    override fun deserialize(decoder: Decoder): LocalDateTime {
        // 2022-01-19T16:04:59+00:00
        return LocalDateTime.parse(decoder.decodeString(), dateTimeFormatter)
    }

    override fun serialize(encoder: Encoder, value: LocalDateTime) = encoder.encodeString(value.format(dateTimeFormatter))

    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("DateSerializer", PrimitiveKind.STRING)
}