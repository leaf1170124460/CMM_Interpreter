package interpreter;

import io.IOInterface;

/**
 * Created by vergil on 2016/12/15.
 */
public class Error {

    public static void conflict_declar_error(IOInterface io, String varname, int line, int offset)
    {
        io.stderr("error:conflicting declaration variable in '"
                + varname
                + "'\n\tin line "
                + line
                +":"
                + offset
                +"\n");
    }

}
