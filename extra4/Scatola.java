package extra4;

public class Scatola<T> {
    private T data;

    public Scatola(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
