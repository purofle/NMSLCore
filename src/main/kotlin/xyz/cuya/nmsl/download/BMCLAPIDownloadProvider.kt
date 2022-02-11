/*
 * Copyright 2022-2022 purofle <purofle@qq.com> and contributors.
 *
 *   Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 *   https://github.com/purofle/NMSLCore/blob/master/LICENSE
 */

package xyz.cuya.nmsl.download

class BMCLAPIDownloadProvider(private val apiRoot: String): DownloadProvider {
    override fun getVersionListURL() = "$apiRoot/mc/game/version_manifest.json"
    override fun getAssetBaseURL() = "$apiRoot/assets/"
}