/**
 * Game: Crazy Eights
 * Number of players: 2 (AI vs player)
 * How to play:
 * Each player is dealt seven cards.
 * The rest of the deck goes facedown in a pile, with the top card turned up beside it. This is the discard pile.
  * The player to the left of the dealer discards a card from his hand that matches either the number or suit of the top card in the discard pile. For example, if the card is a five of hearts, he could play any heart or any five. If he does not have a matching card, he continues picking up cards from the deck until he gets one that is playable.
 *
 * Eights are wild and can be put down on any suit. For example, an eight could be played to match a heart. The next player must match their card to the number or suit that the eight was meant to cover.
 *
 * Play continues with players matching the card at the top of the discard pile. The first player to use up all his cards wins.
 *
 * If none of the players has a matching card, the game ends in a draw.
 *
 */


Initialize the game
	players are dealt 7 cards each.
	display all the cards in the hand.
	display the top card of the deck.
	display the number of the remaining cards in the deck.
	set player1 to the current player.

while game not end {

	if wildCard is set
			wildCard overrides the top card

		if player has any cards matching either the number or suit of the top card (or wildCard)
		print "Select a card to discard"
		player enters the info on the card to discard

		while discard is not complete {
			if player chooses a correct card
				the card is deleted from the hand
				the discarded card is now the top card

				if no cards left in the hand
					print "player xx won!"

					game end

				else if the discarded card value is 8

					set the discarded card to wildCard

					input = invalid
					while input is invalid {
						print "Enter a suit you like"
						player enters a suit

						if input is valid
							wildCard holds the suit player selected insted of the original suit
							input = valid

						else
							print "invalid input!"
					}

				the other player becomes the current player

				discard is complete

			else
				print "Invalid input"
		}

	else (player does not have any matching cards)

		if cards left in the deck
			player draws a card from the deck

		else
			if numberOfPass is smaller than 2
				player declares pass
				numberOfPass++

				the other player becomes the current player

			else
				print "Draw"
				game ends

	print the number of remaining cards in the deck
}
