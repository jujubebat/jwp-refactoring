package kitchenpos.domain;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class MenuFixture {

    public static Menu createWithPrice(BigDecimal price) {
        Menu menu = new Menu();
        menu.setPrice(price);

        return menu;
    }

    public static Menu createWithoutMenuGroupId() {
        Menu menu = new Menu();
        menu.setMenuGroupId(null);

        return menu;
    }

    public static Menu createWithNotExistProductId(Long menuGroupId) {
        Menu menu = new Menu();
        menu.setPrice(BigDecimal.valueOf(10000L));
        menu.setMenuGroupId(menuGroupId);
        menu.setMenuProducts(Arrays.asList(MenuProductFixture.createNotExistsProduct()));

        return menu;
    }

    public static Menu createWithMenuPriceAndProducts(int menuPrice, List<Product> products) {
        Menu menu = new Menu();
        menu.setPrice(BigDecimal.valueOf(menuPrice));
        menu.setMenuGroupId(1L);
        menu.setMenuProducts(MenuProductFixture.create(products));

        return menu;
    }

    public static Menu createWithMenuPriceAndProducts(int menuPrice, Long menuGroupId, List<Product> products) {
        Menu menu = new Menu();
        menu.setPrice(BigDecimal.valueOf(menuPrice));
        menu.setMenuGroupId(menuGroupId);
        menu.setName("TEST_MENU_NAME");
        menu.setMenuProducts(MenuProductFixture.create(products));

        return menu;
    }
}
