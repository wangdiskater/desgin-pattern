package firsttry.bridge.trial;

/**
 * @Description
 * @ClassName Shop
 * @Author wangDi
 * @date 2020-10-21 15:06
 */
public class Shop {
    private Commodity commodity;
    private OutfitColor outfitColor;

    public Shop(Commodity commodity, OutfitColor outfitColor) {
        this.commodity = commodity;
        this.outfitColor = outfitColor;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public OutfitColor getOutfitColor() {
        return outfitColor;
    }

    public void setOutfitColor(OutfitColor outfitColor) {
        this.outfitColor = outfitColor;
    }

    public void show(){
        outfitColor.show();
    }

}
