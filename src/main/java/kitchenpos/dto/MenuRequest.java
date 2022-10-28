package kitchenpos.dto;

import com.sun.istack.NotNull;
import java.math.BigDecimal;
import java.util.List;

public class MenuRequest {
    @NotNull
    private String name;

    @NotNull
    private BigDecimal price;

    @NotNull
    private Long menuGroupId;

    @NotNull
    private List<MenuProductRequest> menuProducts;

    public MenuRequest() {
    }

    public MenuRequest(final String name, final BigDecimal price, final Long menuGroupId,
                       final List<MenuProductRequest> menuProducts) {
        this.name = name;
        this.price = price;
        this.menuGroupId = menuGroupId;
        this.menuProducts = menuProducts;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Long getMenuGroupId() {
        return menuGroupId;
    }

    public List<MenuProductRequest> getMenuProducts() {
        return menuProducts;
    }
}
