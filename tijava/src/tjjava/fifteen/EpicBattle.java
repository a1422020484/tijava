package tjjava.fifteen;

/**
 * @author yangxp 389
 */
public class EpicBattle {
	static <POWER extends SuperHearing> void userSuperHearing(SuperHero<POWER> hero) {
		hero.getPower().hearSubtileNoises();
	}
}

interface SuperPower {

}

interface XRayVision extends SuperPower {
	void seeThroughWalls();
}

interface SuperHearing extends SuperPower {
	void hearSubtileNoises();
}

interface SuperSmell extends SuperPower {
	void trackBySmell();
}

class SuperHero<POWER> {
	POWER power;

	SuperHero(POWER power) {
		this.power = power;
	}

	POWER getPower() {
		return power;
	}
}

class SuperSleuth<POWER extends XRayVision> extends SuperHero<POWER> {
	SuperSleuth(POWER power) {
		super(power);
	}

	void see() {
		power.seeThroughWalls();
	}
}

class CanineHero<POWER extends SuperHearing & SuperSmell> extends SuperHero<POWER> {

	CanineHero(POWER power) {
		super(power);
	}

	void hear() {
		power.hearSubtileNoises();
	}

	void smell() {
		power.trackBySmell();
	}
}

class SuperHearSmell implements SuperHearing, SuperSmell {

	@Override
	public void trackBySmell() {

	}

	@Override
	public void hearSubtileNoises() {

	}

}

class DogBoy extends CanineHero<SuperHearSmell> {

	DogBoy() {
		super(new SuperHearSmell());
	}

}
