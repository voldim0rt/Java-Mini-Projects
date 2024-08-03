### Project Description

This project is a simple web-based Tic-Tac-Toe game implemented using JavaScript, HTML, and CSS. The game allows two players to take turns marking spaces in a 3×3 grid. The first player to align three of their marks horizontally, vertically, or diagonally wins the game. If all nine spaces are filled without any player achieving this, the game ends in a draw.

#### Key Features:
1. **Interactive Gameplay**: Players click on the boxes to place their marks ("X" or "O").
2. **Turn Tracking**: Alternates turns between player "X" and player "O".
3. **Win Detection**: Checks for winning patterns after each move and declares the winner.
4. **Draw Detection**: Declares the game as a draw if all boxes are filled without a winner.
5. **Reset Functionality**: Provides options to reset the game at any point to start over.

#### UI Elements:
- **Boxes**: Clickable grid cells for gameplay, represented as buttons within the game container.
- **Message Container**: Displays game status messages (winner or draw) and includes a button to start a new game.
- **Reset Button**: Allows players to reset the game board.
- **New Game Button**: Also resets the game board for a new game.

#### HTML Structure:
- **Header**: Contains metadata and a link to the CSS file.
- **Body**:
  - **Message Container**: Hidden by default, shown to display the game result.
  - **Main Section**: Contains the game title, game grid, and reset button.

#### CSS Styling:
- **Overall Styling**: Basic reset for margins and padding; centered text alignment; background color for the body.
- **Container**: Flexbox layout to center the game grid vertically and horizontally.
- **Game Grid**: Flexbox layout with wrapped items, centered content, and spacing between the boxes.
- **Boxes**: Square buttons with rounded corners, no border, shadow for depth, and large font for marks.
- **Buttons**: Styled reset and new game buttons with padding, background color, text color, rounded corners, and no border.
- **Message**: Large, centered text with a specific font size.
- **Hidden State**: A utility class to hide elements by setting their display to none.

The project combines functionality and styling to create an engaging and visually appealing Tic-Tac-Toe game experience.
