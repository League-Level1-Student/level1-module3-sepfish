
public class Netflix {
	public static void main(String[] args) {
		Movie one = new Movie("my life", 5);
		Movie two = new Movie("Netflix", 3);
		Movie three = new Movie("Google", 4);
		Movie four = new Movie("Tales of Vesperia: The First Strike", 5);
		Movie five = new Movie("Watch Me Program For An Hour And A Half", 1);
		NetflixQueue hmm = new NetflixQueue();
		hmm.addMovie(one);
		hmm.addMovie(two);
		hmm.addMovie(three);
		hmm.addMovie(four);
		hmm.addMovie(five);
		hmm.printMovies();
		
		System.out.println("the best movie is... " + hmm.getBestMovie());
		System.out.println("the second best movie is... " + hmm.getMovie(1));
	}
}
