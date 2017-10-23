public class CardLock {
    
    private SmartCard lastCardSeen;
    private Boolean studentAccess = false;
    
    public void swipeCard(SmartCard card) {
        //Update the last card seen
        lastCardSeen = card;
    }
    
    public SmartCard getLastCardSeen() {
        //Return the last card seen
        return lastCardSeen;
    }
    
    public Boolean isUnlocked() {
        //Return if the door will be unlocked based on card owner and studentaccess
        
        if (studentAccess == false && lastCardSeen.isStaff() == true) {
            return true;
        } else if (studentAccess == true) {
            return true;
        }else {
            return false;
        }
    }
    
    public void toggleStudentAccess() {
        //Invert the studentAccess variable
        studentAccess = !studentAccess;
    }
    
}