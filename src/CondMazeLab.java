
/**
 * This class help the cat move
 * through the maze
 */
public class CondMazeLab extends Maze
{
    public static void main(String[] args) {

        // Step 1: Run Maze Simulation
        CondMazeLab myMaze = new CondMazeLab();

    }

    public void step()
    {
        // Steps 2 and 3: Implement HERE
        if (puss.isFacingMud()) {
            if (puss.isTipToeing()){ //check if cat is tip toeing
                puss.stopTipToe(); //if yes, stop tiptoe
                if (puss.isInBoots()) { //then check if cat is wearing boots
                    puss.forward(); //if yes, move fw
                }
                else { //if cat is not in boots
                    puss.putOnBoots(); //put on boots
                    puss.forward(); //and move fw
                }
            }
            else { //if cat is not tiptoeing
                if (puss.isInBoots()) { //check if cat is wearing boots
                    puss.forward(); //if yes, move fw
                }
                else { //cat is not wearing boots
                    puss.putOnBoots(); //put on boots
                    puss.forward(); //and move fw
                }
            }
        }

        if (puss.isFacingDog()) { //check if cat is facing dog
            if (puss.isTipToeing()) { //check if cat is tiptoeing
                puss.startTipToe(); //then keep tiptoeing
            }
            else { //if not tiptoing
                if (puss.isInBoots()) { //check if cat is in boots
                    puss.takeOffBoots(); //if yes, take them off
                    puss.startTipToe(); //and start tiptoeing
                }
                else {
                    puss.startTipToe(); //if not wearing boots, tiptoe
                }
            }
        }
        if (puss.isFacingGully()) { //check if cat is facing gully
            if (puss.isTipToeing()) { //if yes, check if cat is tiptoeing
                puss.stopTipToe(); //if yes, stop tiptoeing
                if (puss.isInBoots()){ //check if cat is wearing boots
                    puss.takeOffBoots(); //if yes, take them off
                    puss.jump(); //and jump over the gully
                }
                else {
                    puss.jump(); //if not wearing boots, jump over the gully
                }
            }
            else { //if not tiptoeing
                if (puss.isInBoots()){ //check if cat is wearing boots
                    puss.takeOffBoots(); //if yes, take them off
                    puss.jump(); //and jmp over the gully
                }
                else { //if not wearing boots
                    puss.jump(); //jump over the gully
                }
            }
        }
        if (puss.isFacingWall()) { //check if cat is facing wall
            puss.right(); //turn right
            if (puss.isFacingWall()) { //if keep facing wall
                puss.left(); //turn left
                puss.left(); //and left again to change direction
            }
        }
        else { //if not facing wall
            puss.forward(); //move fw
        }

    }

    public CondMazeLab() { super(true); }
}