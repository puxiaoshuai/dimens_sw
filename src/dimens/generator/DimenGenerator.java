package dimens.generator;

import dimens.constants.DimenTypes;
import dimens.utils.MakeUtils;

public class DimenGenerator {

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
