package com.leewyatt.fxtools.ui.alert;

import com.leewyatt.fxtools.utils.ResourcesUtil;
import com.leewyatt.fxtools.utils.ToolSettingsUtil;
import javafx.scene.Node;

/**
 * @author LeeWyatt
 */
public class DonateAlert extends BaseSimpleAlert {
    public DonateAlert() {
        super(AlertType.INFORMATION);
        String skinStyle = ToolSettingsUtil.getInstance().getSkin();
        getDialogPane().getStylesheets().add("/css/about-alert-"+ skinStyle+".css");
        setContentNode(createContentNode());
    }

    private Node createContentNode() {
        return ResourcesUtil.loadFXML("donate");
    }

}
