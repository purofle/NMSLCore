/*
 * Copyright 2022-2022 purofle <purofle@qq.com> and contributors.
 *
 *   Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 *   https://github.com/purofle/NMSLCore/blob/main/LICENSE
 */

package xyz.cuya.nmsl.download.game

import io.ktor.client.*
import io.ktor.client.features.*
import io.ktor.client.request.*
import xyz.cuya.nmsl.download.DownloadProvider
import xyz.cuya.nmsl.utils.JsonUtils.parserToJson

class GameVersionList(private val downloadProvider: DownloadProvider) {
    private val client = HttpClient()
    suspend fun getGameRemoteVersions(): GameRemoteVersions {
        return client.get<String>(downloadProvider.getVersionListURL()).parserToJson()
    }
}