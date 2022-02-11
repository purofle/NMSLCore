/*
 * Copyright 2022-2022 purofle <purofle@qq.com> and contributors.
 *
 *   Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 *   https://github.com/purofle/NMSLCore/blob/master/LICENSE
 */

package xyz.cuya.nmsl.download

import org.junit.jupiter.api.Test
import xyz.cuya.nmsl.setting.DownloadProviders

internal class BMCLAPIDownloadProviderTest {

    @Test
    fun getVersionListURL() {
        assert(BMCLAPIDownloadProvider(DownloadProviders.bmclapiRoot).getVersionListURL() == "https://bmclapi2.bangbang93.com/mc/game/version_manifest.json")
    }

    @Test
    fun getAssetBaseURL() {
        assert(BMCLAPIDownloadProvider(DownloadProviders.bmclapiRoot).getAssetBaseURL() == "https://bmclapi2.bangbang93.com/assets/")
    }
}