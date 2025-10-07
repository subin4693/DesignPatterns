package BehavioralDesignPattern.MediatorPattern;

public class ExtendedAuctionHouse extends AuctionHouse{
    private Long biddingEndTime;
    public ExtendedAuctionHouse(long biddingEndTime){
        this.biddingEndTime = biddingEndTime;
    }

    public void placeBid(Bidder bidder, int amount){
        if(System.currentTimeMillis() > biddingEndTime){
            System.out.println("Bidding time is over no more bids accepted");
            return;
        }
        System.out.println("LOG: "+ bidder.getName()+ " is bidding" + amount);
        super.placeBid(bidder,amount);
    }

}
