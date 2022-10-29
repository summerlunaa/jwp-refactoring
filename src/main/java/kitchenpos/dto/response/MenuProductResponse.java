package kitchenpos.dto.response;

import kitchenpos.domain.menu.MenuProduct;

public class MenuProductResponse {
    private Long seq;
    private Long productId;
    private long quantity;

    public MenuProductResponse() {
    }

    public MenuProductResponse(final MenuProduct menuProduct) {
        this(menuProduct.getSeq(), menuProduct.getProduct().getId(), menuProduct.getQuantity());
    }

    public MenuProductResponse(final Long seq, final Long productId, final long quantity) {
        this.seq = seq;
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getSeq() {
        return seq;
    }

    public Long getProductId() {
        return productId;
    }

    public long getQuantity() {
        return quantity;
    }
}
