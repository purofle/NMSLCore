/*
 * Copyright 2022-2022 purofle <purofle@qq.com> and contributors.
 *
 *   Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 *   https://github.com/purofle/NMSLCore/blob/main/LICENSE
 */

package xyz.cuya.nmsl.download.game.serializer

import org.junit.jupiter.api.Test
import java.time.LocalDateTime

internal class DateSerializerTest {
    @Test
    fun deserialize() {
        println(LocalDateTime.parse("2022-01-19T16:04:59+00:00", DateSerializer.dateTimeFormatter))
    }
}