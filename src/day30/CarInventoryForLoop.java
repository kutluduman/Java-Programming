package day30;

import java.util.Arrays;

public class CarInventoryForLoop {

    public static void main(String[] args) {


        String[] cars = {"Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "Oldsmobile-Achieva",
                "Honda-Civic",
                "Lexus-SC",
                "Volvo-S70",
                "Infiniti-QX",
                "Oldsmobile-Silhouette",
                "Aston Martin-Rapide",
                "Honda-S2000",
                "Isuzu-i-Series",
                "Acura-MDX",
                "Infiniti-QX",
                "Ford-Edge",
                "Jeep-Compass",
                "BMW-M6",
                "Mazda-929",
                "Pontiac-Grand Am",
                "Chevrolet-3500",
                "Infiniti-Q",
                "Ford-GT",
                "GMC-Savana 3500",
                "Mercedes-Benz-S-Class",
                "Volkswagen-Passat",
                "Volvo-XC60",
                "Saturn-Ion",
                "Spyker-C8",
                "Acura-ZDX",
                "Jeep-Patriot",
                "Honda-Civic",
                "Chevrolet-Colorado",
                "Kia-Sportage",
                "Ford-Transit Connect",
                "Pontiac-Grand Prix",
                "Pontiac-LeMans",
                "Buick-LeSabre",
                "Toyota-Tundra",
                "Nissan-Rogue",
                "Volkswagen-Golf",
                "Subaru-Impreza",
                "Jaguar-XK Series",
                "BMW-8 Series",
                "Mercedes-Benz-S-Class",
                "Chevrolet-Equinox",
                "Honda-Pilot",
                "Acura-MDX",
                "Pontiac-6000",
                "Mitsubishi-Galant",
                "Chevrolet-Corsica",
                "Ford-F-Series",
                "Pontiac-Sunbird",
                "Chevrolet-Silverado",
                "Volkswagen-GTI",
                "Honda-FCX Clarity",
                "Cadillac-Escalade",
                "Audi-riolet",
                "Pontiac-Montana",
                "Mitsubishi-Galant",
                "Mitsubishi-Precis",
                "Porsche-Cayman",
                "Buick-Rendezvous",
                "Dodge-Viper",
                "Chevrolet-Express 1500",
                "Chevrolet-Blazer",
                "Scion-xB",
                "Mazda-Tribute",
                "Oldsmobile-Silhouette",
                "Bentley-Continental Flying Spur",
                "Volkswagen-Passat",
                "Chevrolet-S10",
                "Suzuki-SJ",
                "Ferrari-FF",
                "Jaguar-S-Type",
                "Lexus-LS",
                "Volkswagen-GTI",
                "Toyota-Tacoma",
                "Chevrolet-Traverse",
                "Lincoln-Aviator",
                "Chrysler-300",
                "Kia-Forte",
                "Mazda-B-Series Plus",
                "Mazda-Mazda3",
                "Volkswagen-CC",
                "Audi-Quattro",
                "Honda-Civic",
                "Suzuki-Aerio",
                "Chevrolet-Impala SS",
                "Toyota-Land Cruiser",
                "Chevrolet-Avalanche",
                "Toyota-Tacoma Xtra",
                "Nissan-Altima",
                "Ford-Thunderbird",
                "Mazda-Tribute",
                "Ford-Econoline E250",
                "Lexus-LS",
                "GMC-Sonoma",
                "GMC-2500",
                "Lexus-RX",
                "Jaguar-XK Series",
                "Chevrolet-Venture",
                "Jeep-Wrangler",
                "Maybach-57",
                "GMC-Savana 1500",
                "Kia-Sorento",
                "Daewoo-Leganza",
                "Plymouth-Neon",
                "Chevrolet-Express 2500",
                "Mercedes-Benz-GL-Class",
                "BMW-M3",
                "Dodge-D150",
                "Audi-S4",
                "Ford-Escort",
                "Chrysler-LHS",
                "Pontiac-Firefly",
                "Toyota-Camry",
                "Ford-Explorer Sport Trac",
                "Kia-Rio",
                "GMC-Sierra 3500",
                "BMW-600",
                "GMC-Canyon",
                "Toyota-4Runner",
                "GMC-Sierra 2500",
                "Chrysler-300M",
                "GMC-Sierra",
                "Bentley-Continental GTC",
                "Pontiac-Firebird",
                "Kia-Sedona",
                "Ford-E150",
                "Chevrolet-Suburban 1500",
                "Spyker-C8 Laviolette",
                "Cadillac-XLR",
                "Cadillac-SRX",
                "Chevrolet-Sportvan G20",
                "Geo-Tracker",
                "Dodge-Ram Van 3500",
                "Chevrolet-HHR",
                "Lexus-GS",
                "GMC-Safari",
                "Plymouth-Laser",
                "Nissan-Leaf",
                "Jeep-Grand Cherokee",
                "Nissan-Pathfinder",
                "Suzuki-Daewoo Lacetti",
                "Toyota-Paseo",
                "Isuzu-i-280",
                "Mazda-MX-6",
                "GMC-Jimmy",
                "BMW-760",
                "Lotus-Esprit",
                "Suzuki-Grand Vitara",
                "Buick-Riviera",
                "Volkswagen-rio",
                "Hyundai-Sonata",
                "Lexus-HS",
                "Mercury-Grand Marquis",
                "Mitsubishi-Galant",
                "Ford-Ranger",
                "Dodge-Stratus",
                "Mazda-MX-5",
                "Maserati-GranTurismo",
                "Ford-Ranger",
                "Acura-TL",
                "Chevrolet-Suburban",
                "Lexus-RX",
                "Mitsubishi-Mirage",
                "Ford-LTD",
                "Mercedes-Benz-M-Class",
                "Jeep-Patriot",
                "Citro√´n-CX",
                "Hyundai-Tucson",
                "Pontiac-Grand Am",
                "Ford-Club Wagon",
                "Chevrolet-TrailBlazer",
                "Chevrolet-Corsica",
                "Chevrolet-Camaro",
                "Chrysler-Cirrus",
                "Ford-Crown Victoria",
                "Chevrolet-Camaro",
                "Mercury-Sable",
                "Pontiac-Grand Prix",
                "Geo-Prizm",
                "Honda-S2000",
                "Lincoln-Continental",
                "Ford-F150",
                "BMW-5 Series",
                "MINI-Cooper",
                "Lotus-Esprit",
                "Subaru-XT",
                "Ford-Thunderbird",
                "Cadillac-Escalade ESV",
                "Cadillac-Escalade EXT",
                "Mercedes-Benz-SLK-Class",
                "Dodge-Avenger",
                "BMW-X6",
                "Lamborghini-Countach",
                "Mitsubishi-Expo LRV",
                "Lexus-LS",
                "Hyundai-Elantra",
                "Infiniti-QX56",
                "Volkswagen-Type 2",
                "BMW-525",
                "GMC-Sierra 1500",
                "Toyota-TundraMax",
                "Audi-A6",
                "Pontiac-Sunbird",
                "Mercedes-Benz-300SE",
                "Mazda-MX-5",
                "Chrysler-Cirrus",
                "Chevrolet-Express 3500",
                "Honda-Crosstour",
                "Volkswagen-Type 2",
                "Suzuki-Grand Vitara",
                "Mercedes-Benz-SL-Class",
                "Volvo-XC90",
                "BMW-7 Series",
                "Toyota-Solara",
                "GMC-Savana 2500",
                "Chevrolet-HHR",
                "Chevrolet-Impala SS",
                "Chevrolet-Equinox",
                "Toyota-Sienna",
                "Ford-E350",
                "Lotus-Esprit",
                "Dodge-Avenger",
                "Oldsmobile-Silhouette",
                "Volvo-C70",
                "Lamborghini-Gallardo",
                "Audi-100",
                "BMW-M Roadster",
                "Porsche-Boxster",
                "Land Rover-Freelander",
                "Chrysler-Concorde",
                "Toyota-Tacoma",
                "Lamborghini-Diablo",
                "Chevrolet-Express 3500",
                "GMC-Acadia",
                "Cadillac-Escalade ESV",
                "Audi-A4",
                "Infiniti-QX",
                "Subaru-Loyale",
                "Bentley-Continental GTC",
                "Volkswagen-New Beetle",
                "Pontiac-Grand Am",
                "Pontiac-Fiero",
                "BMW-325",
                "Jeep-Grand Cherokee",
                "Ford-Thunderbird",
                "Mazda-929",
                "Subaru-XT",
                "Dodge-Ram Wagon B250",
                "GMC-Safari",
                "Ford-Explorer",
                "Honda-Accord",
                "Hummer-H2",
                "Chevrolet-Corvette",
                "Mitsubishi-L300",
                "Mercedes-Benz-CL-Class",
                "GMC-Vandura G1500",
                "Kia-Sedona",
                "Chevrolet-Silverado 1500",
                "Mazda-RX-7",
                "Maserati-Karif",
                "Nissan-Maxima",
                "Nissan-350Z",
                "Honda-S2000",
                "Oldsmobile-Ciera",
                "Ford-Econoline E250",
                "Porsche-968",
                "Volkswagen-GTI",
                "Chevrolet-Suburban 1500",
                "Pontiac-1000",
                "Mercedes-Benz-G-Class",
                "Acura-TL",
                "Toyota-Camry",
                "Mercedes-Benz-G-Class",
                "Ferrari-F430",
                "Bentley-Continental",
                "Oldsmobile-Silhouette",
                "Suzuki-Swift",
                "Jaguar-XJ Series",
                "Chevrolet-Sportvan G20",
                "Mitsubishi-Pajero",
                "Nissan-Altima",
                "Chevrolet-Tahoe",
                "Mitsubishi-Mirage",
                "GMC-Acadia",
                "Audi-4000s",
                "Chevrolet-Corvair",
                "GMC-Sonoma Club Coupe",
                "Mazda-Miata MX-5",
                "Honda-Prelude",
                "Lamborghini-Gallardo",
                "Kia-Soul",
                "Chevrolet-Impala",
                "Dodge-Avenger",
                "Ford-Excursion",
                "GMC-Vandura 2500",
                "Mazda-MX-5",
                "Infiniti-JX",
                "Toyota-Prius",
                "Suzuki-Sidekick",
                "Chrysler-Town & Country",
                "Chrysler-Town & Country",
                "GMC-Sierra",
                "Ford-Ranger",
                "Chevrolet-G-Series 3500",
                "Maybach-Landaulet",
                "Chevrolet-Caprice",
                "Ford-F250",
                "Volvo-S40",
                "Acura-NSX",
                "Aston Martin-V8 Vantage",
                "Saab-9000",
                "Volvo-V90",
                "Mercury-Villager",
                "Volkswagen-Passat",
                "Acura-NSX",
                "Volvo-XC90",
                "Hyundai-Azera",
                "Chevrolet-G-Series 2500",
                "Land Rover-Defender 90",
                "Ford-F350",
                "Chevrolet-Suburban 2500",
                "Toyota-FJ Cruiser",
                "Subaru-Impreza",
                "Lotus-Esprit Turbo",
                "Ferrari-458 Italia",
                "Subaru-Tribeca",
                "Suzuki-Samurai",
                "Audi-S4",
                "BMW-M3",
                "Dodge-D250",
                "Volvo-C70",
                "Pontiac-Montana SV6",
                "Dodge-Dakota Club",
                "Mitsubishi-Eclipse",
                "Acura-Integra",
                "GMC-Envoy",
                "Chevrolet-Beretta",
                "Ford-Ranger",
                "Mitsubishi-Galant",
                "Dodge-Avenger",
                "Jaguar-S-Type",
                "Ford-Expedition",
                "Lincoln-Navigator",
                "Mercury-Grand Marquis",
                "Nissan-Frontier",
                "Chrysler-Crossfire Roadster",
                "Porsche-928",
                "Mercedes-Benz-SL-Class",
                "Pontiac-Fiero",
                "GMC-Yukon",
                "Chevrolet-Express 2500",
                "Toyota-4Runner",
                "Mazda-Millenia",
                "Volvo-S40",
                "Nissan-300ZX",
                "Mazda-RX-8",
                "Saturn-Ion",
                "Dodge-Dakota Club",
                "Suzuki-Sidekick",
                "Cadillac-STS",
                "Cadillac-Escalade EXT",
                "Land Rover-Defender 90",
                "Mazda-Familia",
                "Mercedes-Benz-GLK-Class",
                "Audi-5000CS",
                "Ford-E250",
                "Ford-Thunderbird",
                "Buick-Estate",
                "Oldsmobile-88",
                "Mitsubishi-Galant",
                "GMC-Acadia",
                "Mercedes-Benz-S-Class",
                "Mazda-Protege",
                "Volkswagen-Touareg",
                "Buick-Skyhawk",
                "Suzuki-Sidekick",
                "Honda-Civic",
                "Cadillac-STS-V",
                "Acura-Vigor",
                "Suzuki-Sidekick",
                "Mercedes-Benz-W123",
                "GMC-2500",
                "Lexus-IS-F",
                "Chrysler-Sebring",
                "Dodge-Durango",
                "Pontiac-Sunbird",
                "Bentley-Continental GT",
                "Isuzu-Trooper",
                "Acura-MDX",
                "GMC-2500",
                "Nissan-Rogue",
                "Chevrolet-Suburban 1500",
                "Dodge-Viper RT/10",
                "Toyota-Sequoia",
                "Ford-Th!nk",
                "BMW-M6",
                "Chevrolet-Silverado 1500",
                "BMW-600",
                "Pontiac-Grand Am",
                "Porsche-944",
                "Nissan-Titan",
                "Pontiac-G5",
                "Saturn-L-Series",
                "Mitsubishi-Mighty Max",
                "Ford-Mustang",
                "Hummer-H3T",
                "Jaguar-XK",
                "Saab-43711",
                "Ram-1500",
                "Chevrolet-Tahoe",
                "Mitsubishi-Mirage",
                "GMC-1500 Club Coupe",
                "Dodge-Dakota Club",
                "Porsche-911",
                "Mercedes-Benz-CLK-Class",
                "Toyota-4Runner",
                "Honda-Element",
                "Pontiac-Sunbird",
                "Cadillac-XLR-V",
                "Mercedes-Benz-CLK-Class",
                "Land Rover-Range Rover",
                "Ford-Focus",
                "Cadillac-Seville",
                "Subaru-Outback",
                "Jaguar-X-Type",
                "Isuzu-Oasis",
                "Mercury-Mountaineer",
                "Chevrolet-Avalanche 1500",
                "Kia-Forte",
                "Ford-E-Series",
                "Bentley-Continental Flying Spur",
                "Nissan-Frontier",
                "Volkswagen-GTI",
                "Chrysler-LHS",
                "Buick-Riviera",
                "Volvo-V50",
                "GMC-Savana 2500",
                "Maybach-Landaulet",
                "Buick-LaCrosse",
                "Chevrolet-SSR",
                "Bentley-Continental Super",
                "Ford-Mustang",
                "Toyota-Paseo",
                "Audi-5000CS",
                "Toyota-Yaris",
                "Volvo-S40",};

        int chevyCNT = 0;
        int civicCNT = 0;

        for (int x = 0; x < cars.length; x++) {

            if (cars[x].toUpperCase().contains("CHEVROLET")) {

                chevyCNT++;

            }

            if (cars[x].toUpperCase().contains("CIVIC")) {

                civicCNT++;

            }


        }

        System.out.println("chevyCNT = " + chevyCNT);
        System.out.println();
        System.out.println("civicCNT = " + civicCNT);
        System.out.println();

        // Task 2 : Print all location of Civic in this array

        for (int x = 0; x < cars.length; x++) {

            if (cars[x].contains("Civic")) {

                System.out.println("Civic found at location : " + x);


            }


        }

        System.out.println();

        // Task 2 find exact location Honda-Civic

        for (int x = 0; x < cars.length; x++) {

            if (cars[x].equals("Honda-Civic")) {
                System.out.println("Civic found at location : " + x);

            }

        }

        System.out.println();
        // Task 3 : Print Make and Model separately in this format


        for (String eachCar : cars) {


            if (eachCar.startsWith("Honda")) {

                String[] eachCarSplit = eachCar.split("-");

                System.out.println("Car make is " + eachCarSplit[0]
                        + " Car model is " + eachCarSplit[1]);


            }

        }

        System.out.println();

        for (String eachCar : cars) {

            if (eachCar.contains("Toyota")) {

                String[] eachCarSplit = eachCar.split("-");
                System.out.println("Car make is " + eachCarSplit[0]
                        + " Car model is " + eachCarSplit[1]);

            }

        }

        // find all the car with model has only 2 character
        // print them out
        // get the count

        System.out.println();

        int countOfCharCars = 0;

        for (String eachCar : cars) {


            String[] eachCarSplit = eachCar.split("-");

            //               System.out.println("Car make is " +eachCarSplit[0]
            //                       + " Car model is " + eachCarSplit[1]);

            if (eachCarSplit[1].length() == 2) {

                System.out.println(eachCarSplit[1]);
                countOfCharCars++;

            }


        }

        System.out.println("countOfCharCars = " + countOfCharCars);



    }


}
