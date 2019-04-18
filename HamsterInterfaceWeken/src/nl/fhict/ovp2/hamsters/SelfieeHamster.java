package nl.fhict.ovp2.hamsters;

import nl.fhict.ovp2.interfaces.Hamster;
import nl.fhict.ovp2.interfaces.SelfieHamster;

public class SelfieeHamster implements SelfieHamster{

    private String name;
    private int weigth;
    private String kindOfCamera;
    private String socialMedia;
    private double lengthOfSelfieStick;
    private String picturePose;
    private int amountOfPictures;



    public SelfieeHamster(String name, int weigth, String kindOfCamera, String socialMedia, double lengthOfSelfieStick,
                          String picturePose, int amountOfPictures) {
        this.name = name;
        this.weigth = weigth;
        this.kindOfCamera = kindOfCamera;
        this.socialMedia = socialMedia;
        this.lengthOfSelfieStick = lengthOfSelfieStick;
        this.picturePose = picturePose;
        this.amountOfPictures = amountOfPictures;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getWeight() {
        return this.weigth;
    }

    @Override
    public int compareTo(Hamster o) {
        return 0;
    }

    @Override
    public String getKindOfCamera() {
        return this.kindOfCamera;
    }

    @Override
    public String getSocialMedia() {
        return this.socialMedia;
    }

    @Override
    public double getLengthOfSelfieStick() {
        return this.lengthOfSelfieStick;
    }

    @Override
    public String getPicturePose() {
        return this.picturePose;
    }

    @Override
    public int getAmountOfPicturesTaken() {
        return this.amountOfPictures;
    }

}