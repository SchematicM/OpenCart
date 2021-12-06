package repository;

import datamodel.ProductPageModel;

import java.time.LocalDate;

public class ProductPageModelRepository {

    private ProductPageModelRepository() {
    }

    public static ProductPageModel orderUsualProductModel() {
        return ProductPageModel.builder()
                .quantity("2")
                .build();
    }

    public static ProductPageModel orderProductWithSelectFieldModel() {
        return ProductPageModel.builder()
                .select("Select")
                .quantity("1")
                .build();
    }

    public static ProductPageModel orderProductWithSizeFieldModel() {
        return ProductPageModel.builder()
                .size(13)
                .quantity("2")
                .build();
    }

    public static ProductPageModel orderProductWithDeliveryDateFieldModel() {
        return ProductPageModel.builder()
                .deliveryDate(LocalDate.now())
                .quantity("3")
                .build();
    }
}
