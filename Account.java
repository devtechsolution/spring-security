package org.as.devtechsolution;

public class Account implements OnlineAccount, Comparable<Account>{
	
	private Integer noOfRegularMovies;
	private Integer noOfExclusiveMovies;
	private String ownerName;
	//private Double cost;
	
	

	public Account(Integer noOfRegularMovies, Integer noOfExclusiveMovies, String ownerName) {
		super();
		this.noOfRegularMovies = noOfRegularMovies;
		this.noOfExclusiveMovies = noOfExclusiveMovies;
		this.ownerName = ownerName;
		//this.cost= this.monthelyCost();
	}
	
	public double monthelyCost() {
		return basePrice + noOfRegularMovies*regularMoviePrice + 
				noOfExclusiveMovies*exclusiveMoviePrice;
	}



	
	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return (int) (this.monthelyCost()-o.monthelyCost()) ;
	}

	@Override
	public String toString() {
		return "Owner is "+ ownerName + " and monthly cost is " + monthelyCost()+ " USD";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((noOfExclusiveMovies == null) ? 0 : noOfExclusiveMovies.hashCode());
		result = prime * result + ((noOfRegularMovies == null) ? 0 : noOfRegularMovies.hashCode());
		result = prime * result + ((ownerName == null) ? 0 : ownerName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (noOfExclusiveMovies == null) {
			if (other.noOfExclusiveMovies != null)
				return false;
		} else if (!noOfExclusiveMovies.equals(other.noOfExclusiveMovies))
			return false;
		if (noOfRegularMovies == null) {
			if (other.noOfRegularMovies != null)
				return false;
		} else if (!noOfRegularMovies.equals(other.noOfRegularMovies))
			return false;
		if (ownerName == null) {
			if (other.ownerName != null)
				return false;
		} else if (!ownerName.equals(other.ownerName))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
