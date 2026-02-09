package prepInterviewOA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MinimumMeetingRooms {
    public int minimumMeetingRooms(int [][] meetings){
        // criar map e depois só retornar o tamanho do map / sem necessidade
        // quero percorrer [][] e olhando para os intervalos anteriores para ver se podem compartilhar
        // Tenho 15-20, olho no mapa para saber se tem algum intervalo com end menor que 15
        if(meetings.length == 1) return 1;
        //Map<Integer,Integer> intervals = new HashMap<>();

        // 7 - 10 no ArrayList: marcado como occupied
        // entrou 2 - 4: nem 2 e nem 4 estao como occupied: shared room;
        // entrou 3-4: 4 esta como occupied: room++;



        return 0;
    }
}
