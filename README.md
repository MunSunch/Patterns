## Комментарии к заданию "Magic,DRY,SOLID"
1. (O) Рекомендации товаров в классе Shop реализованы через паттерн "Стратегия" из-за
чего в будущем можно переопределить поведение recommendProduct(...);
2. (L) Класс OnlineShop является наследником класса Shop так, что в теории может заменить
Shop при необходимости;
3. (I) Класс OnlineShopImpl реализует интерфейс Online, по которому можно выполнить заказ
онлайн, и Tracking, по которому можно отследить заказ по его id;
4. (D) Shop, в моем понимании, должен хранить список товаров и в идеале их количество => Создан абстрактный класс Shop
OnlineShop должен позволять сделать заказ через интернет и отследить его => Создан класс OnlineShop, который реализовал
интерфейсы Online и Tracking.
