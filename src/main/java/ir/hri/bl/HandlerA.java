package ir.hri.bl;

public class HandlerA implements Handler {
    private Handler next;
    private int id;
    private int limit;

    public HandlerA(int id, Handler handler) {
        this.id = id;
        limit = id * 1000;
        next = handler;
    }

    private int getId() {
        return id;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String HandleRequest(int data) {
        if (data < limit) {
            return "Request for " + data + " handled at level " + getId();
        } else if (next != null) {
            return next.HandleRequest(data);
        } else {
            return ("Request for " + data + " handled BY DEFAULT at level " + getId());
        }
    }
}
