using UnityEngine;
using Vector3 = UnityEngine.Vector3;

public class Ejercicio_5 : MonoBehaviour
{
    [SerializeField] private int speed = 5;
    [SerializeField] private int limite = 4;
    [SerializeField] private int limiteLados = 4;

    private Vector3 direction = Vector3.up + Vector3.right;

    // Update is called once per frame
    void Update()
    {
        Vector3 velocity = direction * Time.deltaTime;
        Vector3 displacement = velocity * speed;

        transform.position += displacement;

        if (transform.position.y > limite)
        {
            direction = Vector3.up * -1 + Vector3.right;
        }

        if (transform.position.x > limiteLados)
        {
            direction = Vector3.right * -1;
        }

        if (transform.position.y < (limite * -1))
        {
            direction = Vector3.up + Vector3.right * -2;
        }

        if (transform.position.x < (limiteLados * -1))
        {
            direction = Vector3.right + Vector3.up;
        }
    }
}