using System.Numerics;
using UnityEngine;
using Vector3 = UnityEngine.Vector3;

public class Ejercicio_2 : MonoBehaviour
{
    [SerializeField] private float speed = 5;

    [SerializeField] private float topLimit;

    [SerializeField] private float downLimit;

    private Vector3 direction = Vector3.up;

    // Update is called once per frame
    void Update()
    {
        Vector3 currectCoords = transform.position;
        if (currectCoords.y > topLimit || currectCoords.y < downLimit)
        {
            direction.y *= -1;
        }

        Vector3 velocity = direction * speed;
        Vector3 displacement = velocity * Time.deltaTime;
        transform.position += displacement;
    }
}