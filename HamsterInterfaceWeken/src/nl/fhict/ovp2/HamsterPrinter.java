package nl.fhict.ovp2;

import static java.lang.System.out;

import nl.fhict.ovp2.interfaces.SelfieHamster;
import nl.fhict.ovp2.interfaces.*;
import nl.fhict.ovp2.interfaces.SnorlaxHamster;

class HamsterPrinter {

    HamsterPrinter() {
    }

    static void print(HamsterFarm hamsterFarm) {
        printWelcomeMessage(hamsterFarm.getName());

        if (hamsterFarm.isEmpty()) {
            printEmptyFarmMessage();
            return;
        }

        for (Hamster hamster : hamsterFarm) {
            if (hamster instanceof RamboHamster) {
                out.printf("%s: %dKg. %nKills: %d%nWeapon: %s%nDeaths: %d%nAmmo: %d%nKillDeathRatio: %f%n%n",
                        hamster.getName(),
                        hamster.getWeight(),
                        ((RamboHamster) hamster).getKills(),
                        ((RamboHamster) hamster).getWeapon(),
                        ((RamboHamster) hamster).getDeaths(),
                        ((RamboHamster) hamster).getAmmo(),
                        ((RamboHamster) hamster).getKillDeathRatio(((RamboHamster) hamster).getDeaths(), ((RamboHamster) hamster).getKills()));
            } else if (hamster instanceof SnorlaxHamster){
                out.printf("%s: %dKg. %nSleepHours: %f%nFoodAmount: %d%nFoodType: %s%n%n", hamster.getName(), hamster.getWeight(),
                        ((SnorlaxHamster) hamster).getSleepHours(),
                        ((SnorlaxHamster) hamster).getFoodAmount(),
                        ((SnorlaxHamster) hamster).getFoodTYpe());
            } else if (hamster instanceof SelfieHamster){
                out.printf("%s: %dKg. %nCamera: %s%nSocialMedia: %s%nLengteSelfieStick: %s%nPose: %s%n%n", hamster.getName(), hamster.getWeight(), ((SelfieHamster) hamster).getKindOfCamera(),
                        ((SelfieHamster) hamster).getSocialMedia(), ((SelfieHamster) hamster).getLengthOfSelfieStick(),
                        ((SelfieHamster) hamster).getPicturePose()
                        );
            }else {
                out.printf("%s: %dKg. %n%n", hamster.getName(), hamster.getWeight());
            }
        }
    }

    private static void printWelcomeMessage(String farmName) {
        out.println("WELCOME TO HAMSTER FARM " + farmName.toUpperCase());
        out.println();
    }

    private static void printEmptyFarmMessage() {
        out.println("No hamsters found.");
    }
}
