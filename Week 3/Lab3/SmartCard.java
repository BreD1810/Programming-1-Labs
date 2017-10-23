public class SmartCard {
    
    private String cardOwner;
    private Boolean cardType = false;
    
    SmartCard(String owner) {
        //Constructor. Sets the cardOwner to the provided parameter
        cardOwner = owner;
    }
    
    public String getOwner() {
        //Return the owner of the card
        return cardOwner;
    }
    
    public Boolean isStaff() {
        //Return true if staff, false if not
        return cardType;
    }
    
    public void setStaff(Boolean status) {
        //Update the cardType
        cardType = status;
    }
    
}