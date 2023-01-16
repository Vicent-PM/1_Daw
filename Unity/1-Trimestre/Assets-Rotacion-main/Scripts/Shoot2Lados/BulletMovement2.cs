using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class BulletMovement2 : MonoBehaviour
{
    [SerializeField] private float speed = 5;

    // Update is called once per frame
    void Update()
    {
        transform.Translate(speed * Time.deltaTime * Vector3.forward);
    }
}