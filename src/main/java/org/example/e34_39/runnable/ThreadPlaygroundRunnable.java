package org.example.e34_39.runnable;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.stream.IntStream;

@Data
@AllArgsConstructor
public class ThreadPlaygroundRunnable implements Runnable{
    private String name;
    @Override
    public void run() {
        Thread.currentThread().setName(this.name);
        IntStream.range(0,10).forEach(i-> System.out.println(this.name));
    }

}
