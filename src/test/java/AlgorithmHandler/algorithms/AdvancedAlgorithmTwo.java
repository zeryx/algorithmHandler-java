package AlgorithmHandler.algorithms;

import java.io.Serializable;
import java.util.Arrays;

public class AdvancedAlgorithmTwo {

    public class TwoWideMatrix {
        Float[] top;
        Float[] bottom;
        int width;
        Boolean dimCheck(){
            return top.length == bottom.length;
        }
        TwoWideMatrix(int size){
            top = new Float[size];
            bottom = new Float[size];
            Arrays.fill(top, 0f);
            Arrays.fill(bottom, 0f);
            width = size;
        }
        void setTop(Float[] arr){top = arr; dimCheck();}
        void setBottom(Float[] arr){bottom = arr; dimCheck();}
         int getWidth(){ return width; }
    }

    public class AlgoInput{
        TwoWideMatrix matrix;
        public AlgoInput(Float[] array1, Float[] array2){
            TwoWideMatrix matrix = new TwoWideMatrix(array1.length);
            matrix.setTop(array1);
            matrix.setBottom(array2);
            this.matrix = matrix;
        }
    }

    public class AlgoOutput implements Serializable {
        Float[] sums;
        public AlgoOutput(Float[] sums){this.sums = sums;}
    }

    public AlgoOutput matrixElmWiseAddition(AlgoInput input) throws Exception {
        if(input.matrix.dimCheck()){
            Float [] sums = new Float[input.matrix.getWidth()];
            Float[] arrayA = input.matrix.top;
            Float[] arrayB = input.matrix.bottom;
            for(int i=0; i<input.matrix.getWidth(); i++){
                sums[i] = arrayA[i]+arrayB[i];
            }
            return new AlgoOutput(sums);
        }
        else throw new Exception("matrix dimension are not the same shape.");
    }
}