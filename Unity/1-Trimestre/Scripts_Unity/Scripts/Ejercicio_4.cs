using UnityEngine;

public class Ejercicio_4 : MonoBehaviour
{
    [SerializeField] private float speed = 5;
    [SerializeField] private float limite = 4;
    private Vector3 direction = Vector3.up + Vector3.right;

    // Update is called once per frame
    void Update()
    {
        Vector3 velocity = direction * speed;
        Vector3 displacement = velocity * Time.deltaTime;

        transform.position += displacement;

        if (transform.position.y > limite + 2)
            direction = Vector3.up * -1 + Vector3.right;
        else if (transform.position.y < (limite * -1))
            direction = Vector3.up + Vector3.right;
    }
}