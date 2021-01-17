package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter  implements NotificationService {

    private final DeliveryService deliveryService = (address, weight) -> {
        if (weight > 30) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering in progress...");
        return true;
    };

        private final NotificationService notificationService = new NotificationService() {
            @Override
            public void success(String address) {
                System.out.println("Package delivered to: " + address);
            }

            @Override
            public void fail(String address) {
                System.out.println("Package not delivered to: " + address);
            }
        };

    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }

    @Override
        public void success(String address) {
            System.out.println("Package delivered to: " + address);
        }

        @Override
        public void fail(String address) {
            System.out.println("Package not delivered to: " + address);
        }
    }
