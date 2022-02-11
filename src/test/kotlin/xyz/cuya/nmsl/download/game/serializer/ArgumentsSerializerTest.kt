/*
 * Copyright 2022-2022 purofle <purofle@qq.com> and contributors.
 *
 *   Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 *   https://github.com/purofle/NMSLCore/blob/main/LICENSE
 */

package xyz.cuya.nmsl.download.game.serializer

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.junit.jupiter.api.Test
import xyz.cuya.nmsl.download.game.Arguments
import kotlin.io.path.Path
import kotlin.io.path.readText

internal class ArgumentsSerializerTest {
    @Test
    fun `test serialize json`() {
        val testJson = Path("/home/purofle/project/NMSLCore/src/test/kotlin/xyz/cuya/nmsl/game/test.json").readText()
        val json = Json {
            ignoreUnknownKeys = true
        }
        println(json.decodeFromString<Arguments>(testJson))
    }
}