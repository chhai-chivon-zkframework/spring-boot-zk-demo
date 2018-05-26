package com.chhaichivon.springzk.view;

import org.springframework.boot.autoconfigure.mobile.DeviceDelegatingViewResolverProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.VariableResolver;

/**
 * @author: Chhai Chivon on 5/25/18.
 */
@RequestMapping("/")
@ResponseBody
public class MasterView  extends SelectorComposer<Component> {

}
