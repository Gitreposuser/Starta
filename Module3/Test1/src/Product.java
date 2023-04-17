import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Product{
    private String name;
    private LocalDate purchaseDate;
    private LocalTime purchaseTime;

    public String getProductName() {
        return name;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseTime(LocalTime purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Product(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!Objects.equals(name, product.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        return result;
    }

    @Override
    public String toString() {
        return "\n Product{" +
                " name='" + name + '\'' +
                ", purchaseTime=" + purchaseTime +
                ", purchaseDate=" + purchaseDate +
                "}";
    }
}