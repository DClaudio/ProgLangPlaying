import java.util.List;

/**
 * Created by claudio.david on 05/08/2015.
 */
public class SimpleOrderManager {
    private final OrderStore orderStore;
    private final OrderWriter orderWriter;

    public SimpleOrderManager(OrderStore orderStore, OrderWriter orderWriter) {
        this.orderStore = orderStore;
        this.orderWriter = orderWriter;
    }

    public void writeAllOrders() {
        List<Order> allOrders = orderStore.getOrders();
        if (allOrders.size() == 0) {
            throw new InvalidOperationException("No orders in store");
        }

        this.orderWriter.writeOrders(allOrders);
    }
}

