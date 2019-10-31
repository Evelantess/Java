package com.epam.lesson7.task1;

public class Main {

    public static void main(String[] args) {
//	    Device device = new Device("NN01", "LG", 1000);
//	    Monitor monitor = new Monitor ("PT01", "LG", 560,
//                1024, 856);
//	    EthernetAdapter adapter = new EthernetAdapter("RED67", "Samsung",
//                600, 500, "TYI7890");
//        System.out.println(device);
//        System.out.println(monitor);
//        System.out.println(adapter);

        Device[] devices = {
                new Device("NN01", "LG", 1000),
                new Monitor("PT01", "LG", 560,
                        1024, 856),
                new EthernetAdapter("RED67", "Samsung",
                        600, 500, "TYI7890"),
                new Device("NN02", "LG", 1500),
                new Monitor("PT02", "FTP", 700,
                        1024, 900),
                new EthernetAdapter("RED98", "Samsung",
                        600, 800, "GIOKLOG099"),
                new EthernetAdapter("YKFK097", "Intel",
                        789, 500, "RTHJK09898"),
                new Device("TYRFG57788", "BNT", 1500),
                new Monitor("PT01", "LG", 560,
                        1024, 856)
        };

//        for (Device dev: devices) {
//            System.out.println(dev);
//            System.out.println(" Hash = " + dev.hashCode());
//        }

        System.out.println("Equals - >" + devices[0].equals(devices[3]));
        System.out.println("Equals - >" + devices[1].equals(devices[8]));
    }
}
