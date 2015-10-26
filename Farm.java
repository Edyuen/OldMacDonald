class Farm 
{     
   private Animal[] aBunchOfAnimals = new Animal[3];
   public Farm () {
   	aBunchOfAnimals[0] = new NamedCow("cow", "edward", "moo");
   	aBunchOfAnimals[1] = new Pig("pig", "oink");
   	aBunchOfAnimals[2] = new Chick("chick","peck", "chirp");
	}

	public void animalSounds() {
		for (int nI = 0; nI < aBunchOfAnimals.length; nI++){
			System.out.println(aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());

		}
		System.out.println("The cow is named " + ((NamedCow)aBunchOfAnimals[0]).getName());
	}
}
