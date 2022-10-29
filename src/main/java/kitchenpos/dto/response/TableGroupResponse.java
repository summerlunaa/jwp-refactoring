package kitchenpos.dto.response;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import kitchenpos.domain.ordertable.TableGroup;

public class TableGroupResponse {
    private Long id;
    private LocalDateTime createdDate;
    private List<OrderTableResponse> orderTables;

    public TableGroupResponse() {
    }

    public TableGroupResponse(final TableGroup tableGroup) {
        this(tableGroup.getId(), tableGroup.getCreatedDate(), getOrderTableResponses(tableGroup));
    }

    private static List<OrderTableResponse> getOrderTableResponses(final TableGroup tableGroup) {
        return tableGroup.getOrderTables().stream()
                .map(OrderTableResponse::new)
                .collect(Collectors.toList());
    }

    public TableGroupResponse(final Long id, final LocalDateTime createdDate,
                              final List<OrderTableResponse> orderTables) {
        this.id = id;
        this.createdDate = createdDate;
        this.orderTables = orderTables;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public List<OrderTableResponse> getOrderTables() {
        return orderTables;
    }
}