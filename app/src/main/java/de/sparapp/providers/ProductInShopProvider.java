package de.sparapp.providers;

import java.util.ArrayList;
import java.util.List;

import de.sparapp.entities.Product;
import de.sparapp.entities.ProductInShop;
import de.sparapp.entities.Shop;

public class ProductInShopProvider {
    private static List<ProductInShop> productsInShops;

    private static void init() {
        if(productsInShops == null) {
            productsInShops = new ArrayList<>();

            productsInShops.add(new ProductInShop(1, ProductProvider.getProductById(1), ShopProvider.getShopByName("Aldi"), 0.89));
            productsInShops.add(new ProductInShop(2, ProductProvider.getProductById(2), ShopProvider.getShopByName("Aldi"), 0.89));
            productsInShops.add(new ProductInShop(3, ProductProvider.getProductById(3), ShopProvider.getShopByName("Aldi"), 0.99));
            productsInShops.add(new ProductInShop(4, ProductProvider.getProductById(4), ShopProvider.getShopByName("Aldi"), 0.89));
            productsInShops.add(new ProductInShop(5, ProductProvider.getProductById(5), ShopProvider.getShopByName("Aldi"), 0.59));
            productsInShops.add(new ProductInShop(6, ProductProvider.getProductById(6), ShopProvider.getShopByName("Aldi"), 0.59));
            productsInShops.add(new ProductInShop(7, ProductProvider.getProductById(7), ShopProvider.getShopByName("Aldi"), 0.99));
            productsInShops.add(new ProductInShop(8, ProductProvider.getProductById(8), ShopProvider.getShopByName("Aldi"), 1.19));
            productsInShops.add(new ProductInShop(9, ProductProvider.getProductById(9), ShopProvider.getShopByName("Aldi"), 1.69));
            productsInShops.add(new ProductInShop(10, ProductProvider.getProductById(10), ShopProvider.getShopByName("Aldi"), 1.69));
            productsInShops.add(new ProductInShop(11, ProductProvider.getProductById(11), ShopProvider.getShopByName("Aldi"), 0.99));
            productsInShops.add(new ProductInShop(12, ProductProvider.getProductById(12), ShopProvider.getShopByName("Aldi"), 1.79));
            productsInShops.add(new ProductInShop(13, ProductProvider.getProductById(13), ShopProvider.getShopByName("Aldi"), 0.99));
            productsInShops.add(new ProductInShop(14, ProductProvider.getProductById(14), ShopProvider.getShopByName("Aldi"), 0.99));
            productsInShops.add(new ProductInShop(15, ProductProvider.getProductById(15), ShopProvider.getShopByName("Aldi"), 0.99));
            productsInShops.add(new ProductInShop(16, ProductProvider.getProductById(16), ShopProvider.getShopByName("Aldi"), 1.19));
            productsInShops.add(new ProductInShop(17, ProductProvider.getProductById(17), ShopProvider.getShopByName("Aldi"), 0.69));
            productsInShops.add(new ProductInShop(18, ProductProvider.getProductById(18), ShopProvider.getShopByName("Aldi"), 0.79));
            productsInShops.add(new ProductInShop(19, ProductProvider.getProductById(19), ShopProvider.getShopByName("Aldi"), 0.99));
            productsInShops.add(new ProductInShop(20, ProductProvider.getProductById(20), ShopProvider.getShopByName("Aldi"), 1.19));
            productsInShops.add(new ProductInShop(21, ProductProvider.getProductById(21), ShopProvider.getShopByName("Aldi"), 0.74));
            productsInShops.add(new ProductInShop(22, ProductProvider.getProductById(22), ShopProvider.getShopByName("Aldi"), 0.74));
            productsInShops.add(new ProductInShop(23, ProductProvider.getProductById(23), ShopProvider.getShopByName("Aldi"), 0.59));
            productsInShops.add(new ProductInShop(24, ProductProvider.getProductById(24), ShopProvider.getShopByName("Aldi"), 0.69));
            productsInShops.add(new ProductInShop(25, ProductProvider.getProductById(25), ShopProvider.getShopByName("Aldi"), 2.69));
            productsInShops.add(new ProductInShop(26, ProductProvider.getProductById(26), ShopProvider.getShopByName("Aldi"), 3.39));
            productsInShops.add(new ProductInShop(27, ProductProvider.getProductById(27), ShopProvider.getShopByName("Aldi"), 1.79));
            productsInShops.add(new ProductInShop(28, ProductProvider.getProductById(28), ShopProvider.getShopByName("Aldi"), 1.69));
            productsInShops.add(new ProductInShop(29, ProductProvider.getProductById(29), ShopProvider.getShopByName("Aldi"), 0.99));
            productsInShops.add(new ProductInShop(30, ProductProvider.getProductById(30), ShopProvider.getShopByName("Aldi"), 1.39));
            productsInShops.add(new ProductInShop(31, ProductProvider.getProductById(31), ShopProvider.getShopByName("Aldi"), 1.49));
            productsInShops.add(new ProductInShop(32, ProductProvider.getProductById(32), ShopProvider.getShopByName("Aldi"), 1.49));
            productsInShops.add(new ProductInShop(33, ProductProvider.getProductById(33), ShopProvider.getShopByName("Aldi"), 1.19));
            productsInShops.add(new ProductInShop(34, ProductProvider.getProductById(34), ShopProvider.getShopByName("Aldi"), 0.59));
            productsInShops.add(new ProductInShop(35, ProductProvider.getProductById(35), ShopProvider.getShopByName("Aldi"), 2.29));
            productsInShops.add(new ProductInShop(36, ProductProvider.getProductById(36), ShopProvider.getShopByName("Aldi"), 1.39));
            productsInShops.add(new ProductInShop(37, ProductProvider.getProductById(37), ShopProvider.getShopByName("Aldi"), 0.99));
            productsInShops.add(new ProductInShop(38, ProductProvider.getProductById(38), ShopProvider.getShopByName("Aldi"), 0.79));
            productsInShops.add(new ProductInShop(39, ProductProvider.getProductById(39), ShopProvider.getShopByName("Aldi"), 1.89));
            productsInShops.add(new ProductInShop(40, ProductProvider.getProductById(40), ShopProvider.getShopByName("Aldi"), 1.79));
            productsInShops.add(new ProductInShop(41, ProductProvider.getProductById(41), ShopProvider.getShopByName("Aldi"), 1.79));
            productsInShops.add(new ProductInShop(42, ProductProvider.getProductById(42), ShopProvider.getShopByName("Aldi"), 1.79));
            productsInShops.add(new ProductInShop(43, ProductProvider.getProductById(43), ShopProvider.getShopByName("Aldi"), 1.09));
            productsInShops.add(new ProductInShop(44, ProductProvider.getProductById(44), ShopProvider.getShopByName("Aldi"), 0.99));
            productsInShops.add(new ProductInShop(45, ProductProvider.getProductById(45), ShopProvider.getShopByName("Aldi"), 1.29));
            productsInShops.add(new ProductInShop(46, ProductProvider.getProductById(46), ShopProvider.getShopByName("Aldi"), 0.89));
            productsInShops.add(new ProductInShop(47, ProductProvider.getProductById(47), ShopProvider.getShopByName("Aldi"), 0.69));
            productsInShops.add(new ProductInShop(48, ProductProvider.getProductById(48), ShopProvider.getShopByName("Aldi"), 0.89));
            productsInShops.add(new ProductInShop(49, ProductProvider.getProductById(49), ShopProvider.getShopByName("Aldi"), 0.49));
            productsInShops.add(new ProductInShop(50, ProductProvider.getProductById(50), ShopProvider.getShopByName("Aldi"), 1.79));


            productsInShops.add(new ProductInShop(51, ProductProvider.getProductById(1), ShopProvider.getShopByName("Lidl"), 0.99));
            productsInShops.add(new ProductInShop(52, ProductProvider.getProductById(2), ShopProvider.getShopByName("Lidl"), 0.89));
            productsInShops.add(new ProductInShop(53, ProductProvider.getProductById(3), ShopProvider.getShopByName("Lidl"), 0.99));
            productsInShops.add(new ProductInShop(54, ProductProvider.getProductById(4), ShopProvider.getShopByName("Lidl"), 0.89));
            productsInShops.add(new ProductInShop(55, ProductProvider.getProductById(5), ShopProvider.getShopByName("Lidl"), 0.59));
            productsInShops.add(new ProductInShop(56, ProductProvider.getProductById(6), ShopProvider.getShopByName("Lidl"), 0.59));
            productsInShops.add(new ProductInShop(57, ProductProvider.getProductById(7), ShopProvider.getShopByName("Lidl"), 0.99));
            productsInShops.add(new ProductInShop(58, ProductProvider.getProductById(8), ShopProvider.getShopByName("Lidl"), 1.29));
            productsInShops.add(new ProductInShop(59, ProductProvider.getProductById(9), ShopProvider.getShopByName("Lidl"), 1.79));
            productsInShops.add(new ProductInShop(60, ProductProvider.getProductById(10), ShopProvider.getShopByName("Lidl"), 1.69));
            productsInShops.add(new ProductInShop(61, ProductProvider.getProductById(11), ShopProvider.getShopByName("Lidl"), 0.99));
            productsInShops.add(new ProductInShop(62, ProductProvider.getProductById(12), ShopProvider.getShopByName("Lidl"), 1.79));
            productsInShops.add(new ProductInShop(63, ProductProvider.getProductById(13), ShopProvider.getShopByName("Lidl"), 0.99));
            productsInShops.add(new ProductInShop(64, ProductProvider.getProductById(14), ShopProvider.getShopByName("Lidl"), 0.99));
            productsInShops.add(new ProductInShop(65, ProductProvider.getProductById(15), ShopProvider.getShopByName("Lidl"), 0.99));
            productsInShops.add(new ProductInShop(66, ProductProvider.getProductById(16), ShopProvider.getShopByName("Lidl"), 1.29));
            productsInShops.add(new ProductInShop(67, ProductProvider.getProductById(17), ShopProvider.getShopByName("Lidl"), 0.69));
            productsInShops.add(new ProductInShop(68, ProductProvider.getProductById(18), ShopProvider.getShopByName("Lidl"), 0.79));
            productsInShops.add(new ProductInShop(69, ProductProvider.getProductById(19), ShopProvider.getShopByName("Lidl"), 0.99));
            productsInShops.add(new ProductInShop(70, ProductProvider.getProductById(20), ShopProvider.getShopByName("Lidl"), 0.99));
            productsInShops.add(new ProductInShop(71, ProductProvider.getProductById(21), ShopProvider.getShopByName("Lidl"), 0.74));
            productsInShops.add(new ProductInShop(72, ProductProvider.getProductById(22), ShopProvider.getShopByName("Lidl"), 0.74));
            productsInShops.add(new ProductInShop(73, ProductProvider.getProductById(23), ShopProvider.getShopByName("Lidl"), 0.69));
            productsInShops.add(new ProductInShop(74, ProductProvider.getProductById(24), ShopProvider.getShopByName("Lidl"), 0.79));
            productsInShops.add(new ProductInShop(75, ProductProvider.getProductById(25), ShopProvider.getShopByName("Lidl"), 2.79));
            productsInShops.add(new ProductInShop(76, ProductProvider.getProductById(26), ShopProvider.getShopByName("Lidl"), 3.49));
            productsInShops.add(new ProductInShop(77, ProductProvider.getProductById(27), ShopProvider.getShopByName("Lidl"), 1.89));
            productsInShops.add(new ProductInShop(78, ProductProvider.getProductById(28), ShopProvider.getShopByName("Lidl"), 1.79));
            productsInShops.add(new ProductInShop(79, ProductProvider.getProductById(29), ShopProvider.getShopByName("Lidl"), 0.99));
            productsInShops.add(new ProductInShop(80, ProductProvider.getProductById(30), ShopProvider.getShopByName("Lidl"), 1.49));
            productsInShops.add(new ProductInShop(81, ProductProvider.getProductById(31), ShopProvider.getShopByName("Lidl"), 1.59));
            productsInShops.add(new ProductInShop(82, ProductProvider.getProductById(32), ShopProvider.getShopByName("Lidl"), 1.59));
            productsInShops.add(new ProductInShop(83, ProductProvider.getProductById(33), ShopProvider.getShopByName("Lidl"), 1.29));
            productsInShops.add(new ProductInShop(84, ProductProvider.getProductById(34), ShopProvider.getShopByName("Lidl"), 0.69));
            productsInShops.add(new ProductInShop(85, ProductProvider.getProductById(35), ShopProvider.getShopByName("Lidl"), 2.29));
            productsInShops.add(new ProductInShop(86, ProductProvider.getProductById(36), ShopProvider.getShopByName("Lidl"), 1.39));
            productsInShops.add(new ProductInShop(87, ProductProvider.getProductById(37), ShopProvider.getShopByName("Lidl"), 0.99));
            productsInShops.add(new ProductInShop(88, ProductProvider.getProductById(38), ShopProvider.getShopByName("Lidl"), 0.79));
            productsInShops.add(new ProductInShop(89, ProductProvider.getProductById(39), ShopProvider.getShopByName("Lidl"), 1.89));
            productsInShops.add(new ProductInShop(90, ProductProvider.getProductById(40), ShopProvider.getShopByName("Lidl"), 1.79));
            productsInShops.add(new ProductInShop(91, ProductProvider.getProductById(41), ShopProvider.getShopByName("Lidl"), 1.79));
            productsInShops.add(new ProductInShop(92, ProductProvider.getProductById(42), ShopProvider.getShopByName("Lidl"), 1.79));
            productsInShops.add(new ProductInShop(93, ProductProvider.getProductById(43), ShopProvider.getShopByName("Lidl"), 1.09));
            productsInShops.add(new ProductInShop(94, ProductProvider.getProductById(44), ShopProvider.getShopByName("Lidl"), 0.99));
            productsInShops.add(new ProductInShop(95, ProductProvider.getProductById(45), ShopProvider.getShopByName("Lidl"), 1.29));
            productsInShops.add(new ProductInShop(96, ProductProvider.getProductById(46), ShopProvider.getShopByName("Lidl"), 0.89));
            productsInShops.add(new ProductInShop(97, ProductProvider.getProductById(47), ShopProvider.getShopByName("Lidl"), 0.69));
            productsInShops.add(new ProductInShop(98, ProductProvider.getProductById(48), ShopProvider.getShopByName("Lidl"), 0.89));
            productsInShops.add(new ProductInShop(99, ProductProvider.getProductById(49), ShopProvider.getShopByName("Lidl"), 0.49));
            productsInShops.add(new ProductInShop(100, ProductProvider.getProductById(50), ShopProvider.getShopByName("Lidl"), 1.79));

            productsInShops.add(new ProductInShop(101, ProductProvider.getProductById(1), ShopProvider.getShopByName("Rewe"), 0.89));
            productsInShops.add(new ProductInShop(102, ProductProvider.getProductById(2), ShopProvider.getShopByName("Rewe"), 0.89));
            productsInShops.add(new ProductInShop(103, ProductProvider.getProductById(3), ShopProvider.getShopByName("Rewe"), 0.99));
            productsInShops.add(new ProductInShop(104, ProductProvider.getProductById(4), ShopProvider.getShopByName("Rewe"), 0.89));
            productsInShops.add(new ProductInShop(105, ProductProvider.getProductById(5), ShopProvider.getShopByName("Rewe"), 0.59));
            productsInShops.add(new ProductInShop(106, ProductProvider.getProductById(6), ShopProvider.getShopByName("Rewe"), 0.59));
            productsInShops.add(new ProductInShop(107, ProductProvider.getProductById(7), ShopProvider.getShopByName("Rewe"), 0.99));
            productsInShops.add(new ProductInShop(108, ProductProvider.getProductById(8), ShopProvider.getShopByName("Rewe"), 1.19));
            productsInShops.add(new ProductInShop(109, ProductProvider.getProductById(9), ShopProvider.getShopByName("Rewe"), 1.69));
            productsInShops.add(new ProductInShop(110, ProductProvider.getProductById(10), ShopProvider.getShopByName("Rewe"), 1.69));
            productsInShops.add(new ProductInShop(111, ProductProvider.getProductById(11), ShopProvider.getShopByName("Rewe"), 0.99));
            productsInShops.add(new ProductInShop(112, ProductProvider.getProductById(12), ShopProvider.getShopByName("Rewe"), 1.79));
            productsInShops.add(new ProductInShop(113, ProductProvider.getProductById(13), ShopProvider.getShopByName("Rewe"), 0.99));
            productsInShops.add(new ProductInShop(114, ProductProvider.getProductById(14), ShopProvider.getShopByName("Rewe"), 0.99));
            productsInShops.add(new ProductInShop(115, ProductProvider.getProductById(15), ShopProvider.getShopByName("Rewe"), 0.99));
            productsInShops.add(new ProductInShop(116, ProductProvider.getProductById(16), ShopProvider.getShopByName("Rewe"), 1.19));
            productsInShops.add(new ProductInShop(117, ProductProvider.getProductById(17), ShopProvider.getShopByName("Rewe"), 0.69));
            productsInShops.add(new ProductInShop(118, ProductProvider.getProductById(18), ShopProvider.getShopByName("Rewe"), 0.79));
            productsInShops.add(new ProductInShop(119, ProductProvider.getProductById(19), ShopProvider.getShopByName("Rewe"), 0.99));
            productsInShops.add(new ProductInShop(120, ProductProvider.getProductById(20), ShopProvider.getShopByName("Rewe"), 1.19));
            productsInShops.add(new ProductInShop(121, ProductProvider.getProductById(21), ShopProvider.getShopByName("Rewe"), 0.74));
            productsInShops.add(new ProductInShop(122, ProductProvider.getProductById(22), ShopProvider.getShopByName("Rewe"), 0.74));
            productsInShops.add(new ProductInShop(123, ProductProvider.getProductById(23), ShopProvider.getShopByName("Rewe"), 0.59));
            productsInShops.add(new ProductInShop(124, ProductProvider.getProductById(24), ShopProvider.getShopByName("Rewe"), 0.69));
            productsInShops.add(new ProductInShop(125, ProductProvider.getProductById(25), ShopProvider.getShopByName("Rewe"), 2.69));
            productsInShops.add(new ProductInShop(126, ProductProvider.getProductById(26), ShopProvider.getShopByName("Rewe"), 3.39));
            productsInShops.add(new ProductInShop(127, ProductProvider.getProductById(27), ShopProvider.getShopByName("Rewe"), 1.79));
            productsInShops.add(new ProductInShop(128, ProductProvider.getProductById(28), ShopProvider.getShopByName("Rewe"), 1.69));
            productsInShops.add(new ProductInShop(129, ProductProvider.getProductById(29), ShopProvider.getShopByName("Rewe"), 0.99));
            productsInShops.add(new ProductInShop(130, ProductProvider.getProductById(30), ShopProvider.getShopByName("Rewe"), 1.39));
            productsInShops.add(new ProductInShop(131, ProductProvider.getProductById(31), ShopProvider.getShopByName("Rewe"), 1.49));
            productsInShops.add(new ProductInShop(132, ProductProvider.getProductById(32), ShopProvider.getShopByName("Rewe"), 1.49));
            productsInShops.add(new ProductInShop(133, ProductProvider.getProductById(33), ShopProvider.getShopByName("Rewe"), 1.19));
            productsInShops.add(new ProductInShop(134, ProductProvider.getProductById(34), ShopProvider.getShopByName("Rewe"), 0.59));
            productsInShops.add(new ProductInShop(135, ProductProvider.getProductById(35), ShopProvider.getShopByName("Rewe"), 2.29));
            productsInShops.add(new ProductInShop(136, ProductProvider.getProductById(36), ShopProvider.getShopByName("Rewe"), 1.39));
            productsInShops.add(new ProductInShop(137, ProductProvider.getProductById(37), ShopProvider.getShopByName("Rewe"), 0.99));
            productsInShops.add(new ProductInShop(138, ProductProvider.getProductById(38), ShopProvider.getShopByName("Rewe"), 0.79));
            productsInShops.add(new ProductInShop(139, ProductProvider.getProductById(39), ShopProvider.getShopByName("Rewe"), 1.89));
            productsInShops.add(new ProductInShop(140, ProductProvider.getProductById(40), ShopProvider.getShopByName("Rewe"), 1.79));
            productsInShops.add(new ProductInShop(141, ProductProvider.getProductById(41), ShopProvider.getShopByName("Rewe"), 1.79));
            productsInShops.add(new ProductInShop(142, ProductProvider.getProductById(42), ShopProvider.getShopByName("Rewe"), 1.79));
            productsInShops.add(new ProductInShop(143, ProductProvider.getProductById(43), ShopProvider.getShopByName("Rewe"), 1.09));
            productsInShops.add(new ProductInShop(144, ProductProvider.getProductById(44), ShopProvider.getShopByName("Rewe"), 0.99));
            productsInShops.add(new ProductInShop(145, ProductProvider.getProductById(45), ShopProvider.getShopByName("Rewe"), 1.29));
            productsInShops.add(new ProductInShop(146, ProductProvider.getProductById(46), ShopProvider.getShopByName("Rewe"), 0.89));
            productsInShops.add(new ProductInShop(147, ProductProvider.getProductById(47), ShopProvider.getShopByName("Rewe"), 0.69));
            productsInShops.add(new ProductInShop(148, ProductProvider.getProductById(48), ShopProvider.getShopByName("Rewe"), 0.89));
            productsInShops.add(new ProductInShop(149, ProductProvider.getProductById(49), ShopProvider.getShopByName("Rewe"), 0.49));
            productsInShops.add(new ProductInShop(150, ProductProvider.getProductById(50), ShopProvider.getShopByName("Rewe"), 1.79));

            productsInShops.add(new ProductInShop(151, ProductProvider.getProductById(1), ShopProvider.getShopByName("Edeka"), 0.89));
            productsInShops.add(new ProductInShop(152, ProductProvider.getProductById(2), ShopProvider.getShopByName("Edeka"), 0.89));
            productsInShops.add(new ProductInShop(153, ProductProvider.getProductById(3), ShopProvider.getShopByName("Edeka"), 0.99));
            productsInShops.add(new ProductInShop(154, ProductProvider.getProductById(4), ShopProvider.getShopByName("Edeka"), 0.89));
            productsInShops.add(new ProductInShop(155, ProductProvider.getProductById(5), ShopProvider.getShopByName("Edeka"), 0.59));
            productsInShops.add(new ProductInShop(156, ProductProvider.getProductById(6), ShopProvider.getShopByName("Edeka"), 0.59));
            productsInShops.add(new ProductInShop(157, ProductProvider.getProductById(7), ShopProvider.getShopByName("Edeka"), 0.99));
            productsInShops.add(new ProductInShop(158, ProductProvider.getProductById(8), ShopProvider.getShopByName("Edeka"), 1.19));
            productsInShops.add(new ProductInShop(159, ProductProvider.getProductById(9), ShopProvider.getShopByName("Edeka"), 1.69));
            productsInShops.add(new ProductInShop(160, ProductProvider.getProductById(10), ShopProvider.getShopByName("Edeka"), 1.69));
            productsInShops.add(new ProductInShop(161, ProductProvider.getProductById(11), ShopProvider.getShopByName("Edeka"), 0.99));
            productsInShops.add(new ProductInShop(162, ProductProvider.getProductById(12), ShopProvider.getShopByName("Edeka"), 1.79));
            productsInShops.add(new ProductInShop(163, ProductProvider.getProductById(13), ShopProvider.getShopByName("Edeka"), 0.99));
            productsInShops.add(new ProductInShop(164, ProductProvider.getProductById(14), ShopProvider.getShopByName("Edeka"), 0.99));
            productsInShops.add(new ProductInShop(165, ProductProvider.getProductById(15), ShopProvider.getShopByName("Edeka"), 0.99));
            productsInShops.add(new ProductInShop(166, ProductProvider.getProductById(16), ShopProvider.getShopByName("Edeka"), 1.19));
            productsInShops.add(new ProductInShop(167, ProductProvider.getProductById(17), ShopProvider.getShopByName("Edeka"), 0.69));
            productsInShops.add(new ProductInShop(168, ProductProvider.getProductById(18), ShopProvider.getShopByName("Edeka"), 0.79));
            productsInShops.add(new ProductInShop(169, ProductProvider.getProductById(19), ShopProvider.getShopByName("Edeka"), 0.99));
            productsInShops.add(new ProductInShop(170, ProductProvider.getProductById(20), ShopProvider.getShopByName("Edeka"), 1.19));
            productsInShops.add(new ProductInShop(171, ProductProvider.getProductById(21), ShopProvider.getShopByName("Edeka"), 0.74));
            productsInShops.add(new ProductInShop(172, ProductProvider.getProductById(22), ShopProvider.getShopByName("Edeka"), 0.74));
            productsInShops.add(new ProductInShop(173, ProductProvider.getProductById(23), ShopProvider.getShopByName("Edeka"), 0.59));
            productsInShops.add(new ProductInShop(174, ProductProvider.getProductById(24), ShopProvider.getShopByName("Edeka"), 0.69));
            productsInShops.add(new ProductInShop(175, ProductProvider.getProductById(25), ShopProvider.getShopByName("Edeka"), 2.69));
            productsInShops.add(new ProductInShop(176, ProductProvider.getProductById(26), ShopProvider.getShopByName("Edeka"), 3.39));
            productsInShops.add(new ProductInShop(177, ProductProvider.getProductById(27), ShopProvider.getShopByName("Edeka"), 1.79));
            productsInShops.add(new ProductInShop(178, ProductProvider.getProductById(28), ShopProvider.getShopByName("Edeka"), 1.69));
            productsInShops.add(new ProductInShop(179, ProductProvider.getProductById(29), ShopProvider.getShopByName("Edeka"), 0.99));
            productsInShops.add(new ProductInShop(180, ProductProvider.getProductById(30), ShopProvider.getShopByName("Edeka"), 1.39));
            productsInShops.add(new ProductInShop(181, ProductProvider.getProductById(31), ShopProvider.getShopByName("Edeka"), 1.49));
            productsInShops.add(new ProductInShop(182, ProductProvider.getProductById(32), ShopProvider.getShopByName("Edeka"), 1.49));
            productsInShops.add(new ProductInShop(183, ProductProvider.getProductById(33), ShopProvider.getShopByName("Edeka"), 1.19));
            productsInShops.add(new ProductInShop(184, ProductProvider.getProductById(34), ShopProvider.getShopByName("Edeka"), 0.59));
            productsInShops.add(new ProductInShop(185, ProductProvider.getProductById(35), ShopProvider.getShopByName("Edeka"), 2.29));
            productsInShops.add(new ProductInShop(186, ProductProvider.getProductById(36), ShopProvider.getShopByName("Edeka"), 1.39));
            productsInShops.add(new ProductInShop(187, ProductProvider.getProductById(37), ShopProvider.getShopByName("Edeka"), 0.99));
            productsInShops.add(new ProductInShop(188, ProductProvider.getProductById(38), ShopProvider.getShopByName("Edeka"), 0.79));
            productsInShops.add(new ProductInShop(189, ProductProvider.getProductById(39), ShopProvider.getShopByName("Edeka"), 1.89));
            productsInShops.add(new ProductInShop(190, ProductProvider.getProductById(40), ShopProvider.getShopByName("Edeka"), 1.79));
            productsInShops.add(new ProductInShop(191, ProductProvider.getProductById(41), ShopProvider.getShopByName("Edeka"), 1.79));
            productsInShops.add(new ProductInShop(192, ProductProvider.getProductById(42), ShopProvider.getShopByName("Edeka"), 1.79));
            productsInShops.add(new ProductInShop(193, ProductProvider.getProductById(43), ShopProvider.getShopByName("Edeka"), 1.09));
            productsInShops.add(new ProductInShop(194, ProductProvider.getProductById(44), ShopProvider.getShopByName("Edeka"), 0.99));
            productsInShops.add(new ProductInShop(195, ProductProvider.getProductById(45), ShopProvider.getShopByName("Edeka"), 1.29));
            productsInShops.add(new ProductInShop(196, ProductProvider.getProductById(46), ShopProvider.getShopByName("Edeka"), 0.89));
            productsInShops.add(new ProductInShop(197, ProductProvider.getProductById(47), ShopProvider.getShopByName("Edeka"), 0.69));
            productsInShops.add(new ProductInShop(198, ProductProvider.getProductById(48), ShopProvider.getShopByName("Edeka"), 0.89));
            productsInShops.add(new ProductInShop(199, ProductProvider.getProductById(49), ShopProvider.getShopByName("Edeka"), 0.49));
            productsInShops.add(new ProductInShop(200, ProductProvider.getProductById(50), ShopProvider.getShopByName("Edeka"), 1.79));

            productsInShops.add(new ProductInShop(201, ProductProvider.getProductById(1), ShopProvider.getShopByName("Netto"), 0.99));
            productsInShops.add(new ProductInShop(202, ProductProvider.getProductById(2), ShopProvider.getShopByName("Netto"), 0.89));
            productsInShops.add(new ProductInShop(203, ProductProvider.getProductById(3), ShopProvider.getShopByName("Netto"), 0.99));
            productsInShops.add(new ProductInShop(204, ProductProvider.getProductById(4), ShopProvider.getShopByName("Netto"), 0.89));
            productsInShops.add(new ProductInShop(205, ProductProvider.getProductById(5), ShopProvider.getShopByName("Netto"), 0.59));
            productsInShops.add(new ProductInShop(206, ProductProvider.getProductById(6), ShopProvider.getShopByName("Netto"), 0.59));
            productsInShops.add(new ProductInShop(207, ProductProvider.getProductById(7), ShopProvider.getShopByName("Netto"), 0.99));
            productsInShops.add(new ProductInShop(208, ProductProvider.getProductById(8), ShopProvider.getShopByName("Netto"), 1.29));
            productsInShops.add(new ProductInShop(209, ProductProvider.getProductById(9), ShopProvider.getShopByName("Netto"), 1.79));
            productsInShops.add(new ProductInShop(210, ProductProvider.getProductById(10), ShopProvider.getShopByName("Netto"), 1.69));
            productsInShops.add(new ProductInShop(211, ProductProvider.getProductById(11), ShopProvider.getShopByName("Netto"), 0.99));
            productsInShops.add(new ProductInShop(212, ProductProvider.getProductById(12), ShopProvider.getShopByName("Netto"), 1.79));
            productsInShops.add(new ProductInShop(213, ProductProvider.getProductById(13), ShopProvider.getShopByName("Netto"), 0.99));
            productsInShops.add(new ProductInShop(214, ProductProvider.getProductById(14), ShopProvider.getShopByName("Netto"), 0.99));
            productsInShops.add(new ProductInShop(215, ProductProvider.getProductById(15), ShopProvider.getShopByName("Netto"), 0.99));
            productsInShops.add(new ProductInShop(216, ProductProvider.getProductById(16), ShopProvider.getShopByName("Netto"), 1.29));
            productsInShops.add(new ProductInShop(217, ProductProvider.getProductById(17), ShopProvider.getShopByName("Netto"), 0.69));
            productsInShops.add(new ProductInShop(218, ProductProvider.getProductById(18), ShopProvider.getShopByName("Netto"), 0.79));
            productsInShops.add(new ProductInShop(219, ProductProvider.getProductById(19), ShopProvider.getShopByName("Netto"), 0.99));
            productsInShops.add(new ProductInShop(220, ProductProvider.getProductById(20), ShopProvider.getShopByName("Netto"), 0.99));
            productsInShops.add(new ProductInShop(221, ProductProvider.getProductById(21), ShopProvider.getShopByName("Netto"), 0.74));
            productsInShops.add(new ProductInShop(222, ProductProvider.getProductById(22), ShopProvider.getShopByName("Netto"), 0.74));
            productsInShops.add(new ProductInShop(223, ProductProvider.getProductById(23), ShopProvider.getShopByName("Netto"), 0.69));
            productsInShops.add(new ProductInShop(224, ProductProvider.getProductById(24), ShopProvider.getShopByName("Netto"), 0.79));
            productsInShops.add(new ProductInShop(225, ProductProvider.getProductById(25), ShopProvider.getShopByName("Netto"), 2.79));
            productsInShops.add(new ProductInShop(226, ProductProvider.getProductById(26), ShopProvider.getShopByName("Netto"), 3.49));
            productsInShops.add(new ProductInShop(227, ProductProvider.getProductById(27), ShopProvider.getShopByName("Netto"), 1.89));
            productsInShops.add(new ProductInShop(228, ProductProvider.getProductById(28), ShopProvider.getShopByName("Netto"), 1.79));
            productsInShops.add(new ProductInShop(229, ProductProvider.getProductById(29), ShopProvider.getShopByName("Netto"), 0.99));
            productsInShops.add(new ProductInShop(230, ProductProvider.getProductById(30), ShopProvider.getShopByName("Netto"), 1.49));
            productsInShops.add(new ProductInShop(231, ProductProvider.getProductById(31), ShopProvider.getShopByName("Netto"), 1.59));
            productsInShops.add(new ProductInShop(232, ProductProvider.getProductById(32), ShopProvider.getShopByName("Netto"), 1.59));
            productsInShops.add(new ProductInShop(233, ProductProvider.getProductById(33), ShopProvider.getShopByName("Netto"), 1.29));
            productsInShops.add(new ProductInShop(234, ProductProvider.getProductById(34), ShopProvider.getShopByName("Netto"), 0.69));
            productsInShops.add(new ProductInShop(235, ProductProvider.getProductById(35), ShopProvider.getShopByName("Netto"), 2.29));
            productsInShops.add(new ProductInShop(236, ProductProvider.getProductById(36), ShopProvider.getShopByName("Netto"), 1.39));
            productsInShops.add(new ProductInShop(237, ProductProvider.getProductById(37), ShopProvider.getShopByName("Netto"), 0.99));
            productsInShops.add(new ProductInShop(238, ProductProvider.getProductById(38), ShopProvider.getShopByName("Netto"), 0.79));
            productsInShops.add(new ProductInShop(239, ProductProvider.getProductById(39), ShopProvider.getShopByName("Netto"), 1.89));
            productsInShops.add(new ProductInShop(240, ProductProvider.getProductById(40), ShopProvider.getShopByName("Netto"), 1.79));
            productsInShops.add(new ProductInShop(241, ProductProvider.getProductById(41), ShopProvider.getShopByName("Netto"), 1.79));
            productsInShops.add(new ProductInShop(242, ProductProvider.getProductById(42), ShopProvider.getShopByName("Netto"), 1.79));
            productsInShops.add(new ProductInShop(243, ProductProvider.getProductById(43), ShopProvider.getShopByName("Netto"), 1.09));
            productsInShops.add(new ProductInShop(244, ProductProvider.getProductById(44), ShopProvider.getShopByName("Netto"), 0.99));
            productsInShops.add(new ProductInShop(245, ProductProvider.getProductById(45), ShopProvider.getShopByName("Netto"), 1.29));
            productsInShops.add(new ProductInShop(246, ProductProvider.getProductById(46), ShopProvider.getShopByName("Netto"), 0.89));
            productsInShops.add(new ProductInShop(247, ProductProvider.getProductById(47), ShopProvider.getShopByName("Netto"), 0.69));
            productsInShops.add(new ProductInShop(248, ProductProvider.getProductById(48), ShopProvider.getShopByName("Netto"), 0.89));
            productsInShops.add(new ProductInShop(249, ProductProvider.getProductById(49), ShopProvider.getShopByName("Netto"), 0.49));
            productsInShops.add(new ProductInShop(250, ProductProvider.getProductById(50), ShopProvider.getShopByName("Netto"), 1.79));


        }
    }

    public static List<ProductInShop> getProductsInShops() {
        init();

        return productsInShops;
    }

    public static List<ProductInShop> getProductsForShop(Shop shop) {
        init();

        ArrayList<ProductInShop> products = new ArrayList<>();

        for(ProductInShop product : productsInShops) {
            if(product.getShop().getId() == shop.getId()) {
                products.add(product);
            }
        }

        return products;
    }

    public static ProductInShop getProduct(Shop shop, Product product) {
        init();

        for(ProductInShop productInShop : productsInShops) {
            if(productInShop.getShop().getId() == shop.getId() && productInShop.getProduct().getId() == product.getId()) {
                return productInShop;
            }
        }

        return null;
    }
}
