/*
 * Copyright 2022-2022 purofle <purofle@qq.com> and contributors.
 *
 *   Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 *   https://github.com/purofle/NMSLCore/blob/master/LICENSE
 */

package xyz.cuya.nmsl.utils

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

object JsonUtils {
    val json = Json {
        ignoreUnknownKeys = true
    }
    inline fun <reified T> String.parserToJson() = json.decodeFromString<T>(this)
}