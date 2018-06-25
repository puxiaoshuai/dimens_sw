package dimens.generator;

import dimens.constants.DimenTypes;
import dimens.utils.MakeUtils;

public class DimenGenerator {
/**
*
*dpi是480,横向像素是1080px，根据px=dp(dpi/160)，横向的dp值是1080/(480/160),也就是360dp
**/
    /**
     * 设计稿尺寸(比如1080*1920)  3
     */
    private static final int DESIGN_WIDTH = 360;

    /**
     * 设计稿高度  没用到
     */
    private static final int DESIGN_HEIGHT = 640;

    public static void main(String[] args) {

        DimenTypes[] values = DimenTypes.values();
        for (DimenTypes value : values) {
            MakeUtils.makeAll(DESIGN_WIDTH, value, "/androidui/adapter");
        }

    }

}
