package org.dracula.test.fission;

import io.fission.Context;
import io.fission.Function;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;

/**
 * @author dk
 */
public class TestEntryPoint implements Function {

    @Override
    public ResponseEntity call(RequestEntity requestEntity, Context context) {
        return ResponseEntity.ok("Hello World!");
    }

}
