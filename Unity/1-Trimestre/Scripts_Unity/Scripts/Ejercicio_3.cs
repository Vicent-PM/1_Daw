using UnityEngine;

public class Ejercicio_3 : MonoBehaviour
{
    private int speed = 5;
    private int limite = 4;
    private Vector3 direction = Vector3.up;

    // Update is called once per frame
    void Update()
    {
        Vector3 velocity = direction * speed;
        Vector3 displacement = velocity * Time.deltaTime;

        transform.position += displacement;

        if (transform.position.y > limite + 2)
        {
            direction = Vector3.up * -1;
        }
        else if (transform.position.y < (limite * -1))
        {
            direction = Vector3.up * 2;
        }
    }
}