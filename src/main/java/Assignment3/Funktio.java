package Assignment3;

import java.util.function.Function;

public class Funktio implements Function<Integer, Integer>  {



    @Override
    public Integer apply(Integer integer) {
        return integer*integer;
    }
}
