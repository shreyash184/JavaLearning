public class Hotel {
    public int pricePerNight;
    public int rating;
    public HotelType hotelType;

    public Hotel(int pricePerNight, int review, HotelType hotelType){
        this.pricePerNight = pricePerNight;
        this.rating = review;
        this.hotelType = hotelType;
    }
    public int getPricePerNight(){
        return pricePerNight;
    }
    public int getRating(){
        return rating;
    }
    public HotelType getHotelType(){
        return hotelType;
    }
    public void setPricePerNight(int pricePerNight){
        this.pricePerNight = pricePerNight;
    }
    public void setRating(int rating){
        this.rating = rating;
    }
    public void setHotelType(HotelType hotelType){
        this.hotelType = hotelType;
    }
}
