/*  Created on 30.01.2023
 *
 *  Copyright (c) 2023
 *  topsystem GmbH, Aachen, Germany
 *
 *  All rights reserved
 */

import Items.HealingPotion;
import Items.Potion;

/**
 * @author <a href="mailto:fabian.stetter@epg.com">Fabian Stetter</a>
 */
public class HelloWorld {

	public static void main(String[] args) {


		System.out.println("Hello World :3");

		System.out.println("Cedric ist ein fischkopf");

		Potion heilung = new HealingPotion();

		heilung.trankNutzen();
	}


}
