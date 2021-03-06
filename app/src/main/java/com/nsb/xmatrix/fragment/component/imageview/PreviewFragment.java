/*
 * Copyright (C) 2018 xuexiangjys(xuexiangjys@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nsb.xmatrix.fragment.component.imageview;

import com.xuexiang.xpage.annotation.Page;
import com.nsb.xmatrix.base.ComponentContainerFragment;
import com.nsb.xmatrix.fragment.component.imageview.preview.NineGridImageViewFragment;
import com.nsb.xmatrix.fragment.component.imageview.preview.PreviewRecycleViewFragment;

/**
 *
 * @since 2018/12/8 下午5:26
 */
@Page(name = "图片预览")
public class PreviewFragment extends ComponentContainerFragment {
    /**
     * 获取页面的类集合[使用@Page注解进行注册的页面]
     *
     * @return
     */
    @Override
    protected Class[] getPagesClasses() {
        return new Class[] {
                PreviewRecycleViewFragment.class,
                NineGridImageViewFragment.class
        };
    }
}
