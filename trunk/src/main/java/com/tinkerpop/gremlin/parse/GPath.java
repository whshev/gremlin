package com.tinkerpop.gremlin.parse;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 * @version 0.1
 */
public class GPath {

    protected String gPath;

    public GPath(String gPath) {
        this.gPath = gPath;
    }

    public String toString() {
        return this.gPath;
    }
}
